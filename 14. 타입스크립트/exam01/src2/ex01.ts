type UserType = {
  email: string
  name: string
}

let user01 = {
  email: 'user01@test.org',
  name: '사용자01',
}

user01 = user01 as UserType
//user01.address = '추가'
