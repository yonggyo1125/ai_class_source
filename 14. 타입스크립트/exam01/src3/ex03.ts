enum Direction {
    UP = 'UP',
    DOWN = 'DOWN',
    LEFT = 'LEFT',
    RIGHT = 'RIGHT'
}

console.log(`UP:${Direction.UP}, DOWN:${Direction.DOWN}, LEFT:${Direction.LEFT}, RIGHT:${Direction.RIGHT}`)

let dir = 'DOWN' as Direction
console.log(dir === Direction.DOWN)