import styled from 'styled-components';

export const SmallButton = styled.button`
  min-width: 80px;
  height: 50px;
  border: 0;
  background: ${({ bg }) => bg};
  color: ${({ color }) => color};
`;

export const MediumButton = styled.button`
  min-width: 150px;
  height: 95px;
  border: 0;
  background: ${({ bg }) => bg};
  color: ${({ color }) => color};
`;
