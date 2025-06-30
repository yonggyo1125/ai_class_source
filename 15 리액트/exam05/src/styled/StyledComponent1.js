import { SmallButton, MediumButton } from '../global/components/Buttons';

const StyledComponent1 = () => {
  return (
    <div>
      <SmallButton color="red" bg="orange" border={false}>
        클릭1
      </SmallButton>
      <MediumButton color="white" bg="blue">
        클릭2
      </MediumButton>
    </div>
  );
};

export default StyledComponent1;
