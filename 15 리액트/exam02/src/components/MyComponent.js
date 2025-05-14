const MyComponent = (props) => {
  console.log('props', props);
  console.log('---------------------------------------');
  console.log(Object.getOwnPropertyDescriptors(props));
  console.log(Object.isExtensible(props));

  return (
    <>
      <div>나의 멋진 함수형 컴포넌트</div>
      <div>{props.name}님, 반갑습니다.</div>
      <div>내가 좋아하는 숫자는 {props.number}.</div>
    </>
  );
};

export default MyComponent;
