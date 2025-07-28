type User = {
  name: string
  age: number
}

type UserKey = keyof User  // 'name' | 'age' 

let key: UserKey = 'name'
//key = 'email'