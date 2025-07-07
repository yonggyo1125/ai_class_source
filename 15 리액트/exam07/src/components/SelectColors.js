const colors = ['red', 'black', 'blue', 'orange', 'yellow', 'skyblue', 'green'];

const SelectColors = () => {
  return (
    <div>
      {colors.map((color, i) => (
        <span
          key={color + '-' + i}
          style={{
            width: '45px',
            height: '45px',
            background: color,
            cursor: 'pointer',
          }}
        ></span>
      ))}
    </div>
  );
};
