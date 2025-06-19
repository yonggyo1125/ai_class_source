import React from 'react';

const AverageChild2 = () => {
  console.log('AverageChild2 렌더링!');
  return <h1>AverageChild2</h1>;
};

export default React.memo(AverageChild2);
