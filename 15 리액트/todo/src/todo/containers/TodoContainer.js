import { useState } from 'react';
import { produce } from 'immer';
import TodoForm from '../components/TodoForm';
import TodoItems from '../components/TodoItems';

const TodoContainer = () => {
  const [form, setForm] = useState({});
  const [items, setItems] = useState([
    { id: 1, title: '할일1', content: '할일1 내용', checked: false },
    { id: 2, title: '할일2', content: '할일2 내용', checked: true },
    { id: 3, title: '할일3', content: '할일3 내용', checked: false },
  ]);
  const [errors, setErrors] = useState({});

  const onSubmit = (e) => {
    e.preventDefault();

    // 유효성 검사
    let hasErrors = false;
    const requiredFields = {
      title: '제목을 입력하세요.',
      content: '내용을 입력하세요.',
    };
    const errors = {};
    for (const [field, message] of Object.entries(requiredFields)) {
      if (!form[field] || !form[field]?.trim()) {
        errors[field] = message;
        hasErrors = true;
      }
    }

    // 유효성 검사 실패시 다음 로직 실행 X
    setErrors(errors);

    if (hasErrors) return;

    //setItems(items.concat({ ...form, id: Date.now() }));
    setItems(
      produce((draft) => {
        draft.push({ ...form, id: Date.now() });
      }),
    );
    // 양식 초기화
    setForm({});
  };

  const onChange = (e) => {
    setForm({ ...form, [e.target.name]: e.target.value });
  };

  // 체크박스 토클 처리
  const onToggle = (id) => {
    setItems((prevItems) =>
      prevItems.map((item) =>
        item.id === id ? { ...item, checked: !item.checked } : item,
      ),
    );
  };

  // 스케줄 하나 삭제 처리
  const onRemove = (id) => {
    //setItems((prevItems) => prevItems.filter((item) => item.id !== id));
    const index = items.findIndex((item) => item.id === id);
    setItems(
      produce((draft) => {
        draft.splice(index, 1, 0);
      }),
    );
  };

  // 선택된 스케줄 일괄 삭제 처리
  const onRemoveAll = () => {
    setItems(items.filter(({ checked }) => !checked));
  };

  return (
    <>
      <TodoForm
        onSubmit={onSubmit}
        onChange={onChange}
        form={form}
        errors={errors}
      />
      <TodoItems
        items={items}
        onToggle={onToggle}
        onRemove={onRemove}
        onRemoveAll={onRemoveAll}
      />
    </>
  );
};

export default TodoContainer;
