import Link from 'next/link'
export default function MainPage() {
  return (
    <>
      <h1>메인 페이지!</h1>
      <Link href="/board/list/freetalk">자유게시판(CSR)</Link>
      <a href="/board/list/notice">공지사항(SSR)</a>
    </>
  )
}
