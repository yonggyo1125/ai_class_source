import styled from 'styled-components';

const StyledButton = styled.button`
  background: ${({bg}) => bg ?? 'black'};
  color: ${({color}) => color ?? 'white'};
  border: 0;
  height: 100px;
  width: 250px;
`;

const StyledComponent1 = () => {
  return (
    <div>
      <StyledButton color="red" bg="orange">
        클릭
      </StyledButton>
    </div>
  );
};

export default StyledComponent1;
