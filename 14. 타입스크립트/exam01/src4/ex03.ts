type UserType = {
  readonly email: string
  name: string
}

const user01: UserType = {
  email: 'user01@test.org',
  name: '사용자01',
}

//user01.email = 'user02@test.org' // 수정 불가
user01.name = '사용자02'

type UserType2 = {
  email: string
  name: string
}

type UserReadonly = Readonly<UserType2>

const user02: UserReadonly = {
  email: 'user02@test.org',
  name: '사용자02',
}

//user02.email = '수정'
//user02.name = '수정'
