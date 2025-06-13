import { Component } from 'react';

class Counter2 extends Component {
  state = {
    number: 0,
  };

  render() {
    const { number } = this.state;
    console.log('호출!', number);
    return (
      <>
        <h1>{number}</h1>
        <button
          type="button"
          onClick={() => this.setState({ number: number - 1 })}
        >
          -1
        </button>
        <button
          type="button"
          onClick={() => this.setState({ number: number + 1 })}
        >
          +1
        </button>
      </>
    );
  }
}

export default Counter2;
