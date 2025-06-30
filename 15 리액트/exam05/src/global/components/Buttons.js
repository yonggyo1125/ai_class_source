import styled, { css } from 'styled-components';

const commonStyle = css`
  border: 0;
  background: ${({ bg }) => bg};
  color: ${({ color }) => color};
  ${({ border }) =>
    border &&
    css`
      border: 3px solid #000;
    `}
`;

export const SmallButton = styled.button`
  min-width: 80px;
  height: 50px;
  ${commonStyle}
`;

export const MediumButton = styled.button`
  min-width: 150px;
  height: 95px;
  ${commonStyle}
`;
