const view = {
    init() {
        const searchParams = new URLSearchParams(location.search);
        const seq = searchParams.get("seq");
        try {
            if (!seq) {
                throw new Error("잘못된 접근입니다.");
            }

            let items = localStorage.getItem("todos");
            items = items ? JSON.parse(items) : [];
            const errorMessage = "조회된 일정이 없습니다.";
            if (items.length === 0) {
                throw new Error(errorMessage);
            }

            const item = items.find(item => item.seq === Number(seq));
            if (!item) {
               throw new Error(errorMessage);
            }
            

            let html = document.getElementById("tpl").innerHTML;
            const { date, title, content } = item;
            html = html.replace(/#{date}/g, date)
                        .replace(/#{title}/g, title)
                        .replace(/#{content}/g, content);
            
            const targetEl = document.getElementById("todo-content");
            targetEl.innerHTML = html;

        } catch (err) {
            alert(err.message);
            history.back();
        }
        
    },
}

window.addEventListener("DOMContentLoaded", function() {
    view.init();
});