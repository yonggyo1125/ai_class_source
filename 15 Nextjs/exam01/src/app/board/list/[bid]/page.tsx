export default async function BoardListPage({ params }) {
  const pathParams = await params
  console.log(pathParams)
  return <h1>게시판 목록</h1>
}
