const todo = {
    items: [], // 스케줄 목록
    tpl: null, // 스케줄 목록을 추가할때 사용할 템플릿 
    /**
     * 스케줄 페이지 접근시 초기에 할 작업 
     * 
     */
    init() {

        // 템플릿 가져오기
        this.tpl = document.getElementById("tpl").innerHTML;

        // 저장된 스케줄 목록 조회 
        const data = localStorage.getItem("todos");
        this.items = data ? JSON.parse(data) : [];
        
        // 스케줄 목록 출력 
        this.render();
    },
    /**
     * 스케줄 등록 처리 
     * 
     * @param {*} item 
     */
    add(item) {

        this.items.push(item);

        // 스케줄 목록을 날짜별 내림 차순으로 정렬
        this.items.sort((i1, i2) => {
            const date1 = new Date(i1.date);
            const date2 = new Date(i2.date);
            console.log(date2.getTime() - date1.getTime());
            return date2.getTime() - date1.getTime();
        });

        // 저장 처리 
        this.save();

        // 스케줄 목록 갱신 
        this.render();
    },
    /**
     * 스케줄 삭제 처리 
     * 
     * @param {*} seq : 스케줄 등록 번호 
     */
    remove(seq) {
        const index = this.items.findIndex(item => item.seq === seq);
        if (index === -1) return; 

        this.items.splice(index, 1);
        
        
        // 스케줄 저장 처리 
        this.save();

        // 스케줄 목록 갱신
        this.render();
    },
    /**
     * 스케줄 목록 출력 
     * 
     */
    render() {
        const targetEl = document.getElementById("schedule-items");
        const domParser = new DOMParser();

        targetEl.innerHTML = `
                            <div class="d-flex justify-content-center mt-5 mb-10">
                                <div class="spinner-grow text-info" role="status">
                                    <span class="visually-hidden">등록된 스케줄을 조회하고 있습니다.</span>
                                </div>
                            </div>`;
        
        if (this.items.length === 0) {
            setTimeout(() => {
                targetEl.innerHTML = `<div class="alert alert-warning" role="alert">
                                        등록된 스케줄이 없습니다.
                                     </div>`;
            }, 1500);
            return;
        }

        setTimeout(() => {
            targetEl.innerHTML = '';
            this.items.forEach(({seq, date, title, content}) => {
                let html = todo.tpl;

                html = html.replace(/#{seq}/g, seq)
                        .replace(/#{date}/g, date)
                        .replace(/#{title}/g, title)
                        .replace(/#{content}/g, content);
                
                const dom = domParser.parseFromString(html, "text/html");
                const el = dom.querySelector(".accordion-item");
                targetEl.append(el);

                // 삭제 버튼 클릭 처리 S 
                const removeEl = el.querySelector(".remove");
                removeEl.addEventListener("click", () => {
                    if (confirm('정말 삭제하겠습니까?')) {
                        this.remove(seq);
                    }
                });
                // 삭제 버튼 클릭 처리 E 
            });
        }, 1500);
    },
    /**
     * 스케줄 저장 처리 
     * 
     * this.items에 저장된 내용을 localStorage를 사용하여 이름 todos하여 JSON 문자열로 변환하여 저장 
     */
    save() {
        const data = JSON.stringify(this.items);
        localStorage.setItem("todos", data);
    }
}

window.addEventListener("DOMContentLoaded", function() {
    todo.init(); // 스케줄 목록 초기화 


    const quill = new Quill('#todo-content', {
        theme: 'bubble',
    });

    /**
     * 스케줄 등록 처리 
     * 
     * 1. 유효성 검사 - 필수 항목 (날짜, 제목, 내용)
     *               - 검증 실패시 에러메세지를 출력, 실행 중단
     * 2. 스케줄을 등록하는 처리 
     * 3. 등록이 완료되면 입력했던 내용을 초기화
     */
    frmRegist.addEventListener("submit", function(e) {
        e.preventDefault(); // 기본 동작 차단

        // 유효성 검사 - 필수 항목 (날짜, 제목, 내용) S 
        
        // 에러 메세지 초기화
        const errorEls = frmRegist.querySelectorAll(".alert");
        errorEls.forEach(el => el.parentElement.removeChild(el));

        const requiredFields = {
            date: '날짜를 입력하세요.',
            title: '제목을 입력하세요.',
        }

        const errors = [], item = { seq: Date.now() };

        for (const [field, message] of Object.entries(requiredFields)) {
            const value = typeof frmRegist[field].value === 'string' ? frmRegist[field].value.trim() : '';
            if (!value) {
                errors.push(message);
            } else {
                item[field] = value;
            }
        }

        if (!quill.getText().trim()) {
            errors.push('내용을 입력하세요.');
        } else {
            item.content = quill.root.innerHTML.trim();
        }

        // 검증 실패한 경우, 에러메세지를 출력 및 실행 중단
        if (errors.length > 0) {
            errors.reverse();
            errors.forEach(m => {
                const errorEl = document.createElement("div");
                errorEl.className = 'alert alert-danger';
                errorEl.setAttribute("role", "alert")
                errorEl.append(m);
                frmRegist.prepend(errorEl)
            });
            return;
        }
        // 유효성 검사 E

        // 스케줄 등록 처리 
        todo.add(item);

        // 입력 내용 초기화
        frmRegist.date.value = '';
        frmRegist.title.value = '';
        quill.root.innerHTML = '';
    });
});