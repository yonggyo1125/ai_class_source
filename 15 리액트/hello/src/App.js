import MyComponent from "./MyComponent";
import MyComponent2 from "./MyComponent2";

function App() {
  const name = "이이름";

  return (
    <>{/*
        <MyComponent />
      */}
      <MyComponent2 // 한줄 주석
      />
      {name}
    </>
  )
}

export default App;