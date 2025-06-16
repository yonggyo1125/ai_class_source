import { useState } from 'react';
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

    setItems(items.concat({ ...form, id: Date.now() }));

    // 양식 초기화
    setForm({});
  };

  const onChange = (e) => {
    setForm({ ...form, [e.target.name]: e.target.value });
  };

  return (
    <>
      <TodoForm
        onSubmit={onSubmit}
        onChange={onChange}
        form={form}
        errors={errors}
      />
      <TodoItems items={items} />
    </>
  );
};

export default TodoContainer;
