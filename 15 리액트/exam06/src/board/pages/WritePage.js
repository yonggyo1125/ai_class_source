import React, { useState, Suspense } from 'react';

const SplitMe = React.lazy(() => import('./SplitMe'));

const WritePage = () => {
  const [visible, setVisible] = useState(false);

  return (
    <>
      <h1>글 작성...</h1>
      <button type="button" onClick={() => setVisible(true)}>
        보이기
      </button>
      <Suspense fallback={<div>로딩중....</div>}>
        {visible && <SplitMe />}
      </Suspense>
    </>
  );
};

export default React.memo(WritePage);
