import ListContainer from '../../containers/ListContainer'
export default async function BoardListPage({ params, searchParams }) {
  const pathParams = await params
  console.log('경로변수', pathParams)

  const queryString = await searchParams
  console.log('쿼리스트링', queryString)
  return <ListContainer />
}
