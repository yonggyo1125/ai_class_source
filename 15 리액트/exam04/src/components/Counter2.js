import { useState, useCallback } from "react";

const Counter2 = () => {
    const [number, setNumber] = useState(0);

    // const onIncrease = () => setNumber(number+1);
    // const onDecrease = () => setNumber(number-1);

    // const onIncrease = useCallback(() => setNumber(number+1), [number]);
    // const onDecrease = useCallback(() => setNumber(number-1), [number]);
    const onIncrease = useCallback(() => {
        setNumber((number) => number + 1);
    }, []);

    const onDecrease = useCallback(() => {
        setNumber((number) => number - 1);
    }, [])
    return (
        <>
            <h1>{number}</h1>
            <button type='button' onClick={onDecrease}>-1</button>
            <button type='button' onClick={onIncrease}>+1</button>
        </>
    )
};

export default Counter2;