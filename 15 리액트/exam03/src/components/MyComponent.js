const MyComponent = ({ color, favoriteNumber }) => {
  return (
    <>
      <h1 style={{ background: color }}>나의 멋진 컴포넌트(함수)</h1>
      <h2>좋아하는 숫자는 {favoriteNumber} 입니다.</h2>
    </>
  );
};

export default MyComponent;
