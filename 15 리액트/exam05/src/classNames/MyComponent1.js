import './MyComponent1.css';
import { useState } from 'react';
import classNames from 'classnames';

const MyComponent1 = () => {
  const [visible, setVisible] = useState(false);

  const onToggle = () => setVisible(!visible);

  return (
    <>
      <button type="button" onClick={onToggle}>
        토글!
      </button>
      <h1 className={classNames({ hidden: !visible })}>보일까 말까?</h1>
    </>
  );
};

export default MyComponent1;
