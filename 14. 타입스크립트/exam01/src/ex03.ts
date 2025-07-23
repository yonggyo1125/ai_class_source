type UserType = {
  email: string
  password?: string
  name: string
}

type AddressType = {
  zonecode: string
  address: string
}

type UserWithAddressType = UserType & AddressType

const user01: UserType & AddressType = {
  // & : 교집합, 타입을 결합해서 필수 타입
  email: 'user01@test.org',
  name: '사용자01',
  zonecode: '0000',
  address: '주소',
}

const user02: UserWithAddressType = {
  // & : 교집합, 타입을 결합해서 필수 타입
  email: 'user01@test.org',
  name: '사용자01',
  zonecode: '0000',
  address: '주소',
}
