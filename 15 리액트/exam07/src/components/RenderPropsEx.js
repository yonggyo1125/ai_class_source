const RenderPropsEx = ({ children }) => {
  const value = { color: 'blue', ea: 10 };

  return children(value);
};

export default RenderPropsEx;
