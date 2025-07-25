type UserType = {
  email: string
  username: string
  age: number
}

type AddressType = {
  zipcode: string
  address: string
}

type UserWithAddressType = UserType & AddressType

const user02: UserWithAddressType = {
  email: 'user02@test.org',
  username: 'user02',
  age: 40,
  zipcode: '1000',
  address: '주소',
}

function getUser(): UserType | void {}

function printUser(user?: UserType) {
  console.log(user?.username ?? '기본값')
}

printUser()
