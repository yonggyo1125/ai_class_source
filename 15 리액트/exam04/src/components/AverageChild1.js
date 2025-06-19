import React from 'react';
import AverageChild2 from './AverageChild2';

const AverageChild1 = () => {
  console.log('AverageChild1 렌더링!');

  return (
    <>
      <h1>AverageChild1</h1>
      <AverageChild2 />
    </>
  );
};

export default React.memo(AverageChild1);
