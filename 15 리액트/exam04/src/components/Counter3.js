import React, { useReducer, useCallback } from 'react';

function reducer(state, action) {
  console.log('state', state, 'action', action);

  return state;
}

const Counter3 = () => {
  const [state, dispatch] = useReducer(reducer, { number: 0 });

  const { number } = state;

  const onIncrease = useCallback(() => {
    dispatch({ type: 'INCREASE' });
  }, []);

  const onDecrease = useCallback(() => {
    dispatch({ type: 'DECREASE' });
  }, []);

  return (
    <>
      <h1>{number}</h1>
      <button type="button" onClick={onDecrease}>
        -1
      </button>
      <button type="button" onClick={onIncrease}>
        +1
      </button>
    </>
  );
};

export default React.memo(Counter3);
