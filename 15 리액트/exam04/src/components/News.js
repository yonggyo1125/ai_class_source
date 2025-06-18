import { useState, useEffect } from 'react';

const News = () => {
  useEffect(() => {
    // 컴포넌트가 마운트 되었을때 호출
    fetch(
      'https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=6593897e9b3d40178104e2cb158f2866',
    )
      .then((res) => res.json())
      .then((items) => console.log(items));
  }, []);

  return <></>;
};

export default News;
