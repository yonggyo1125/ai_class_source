/* eslint-disable @next/next/no-html-link-for-pages */
'use client'
import { useParams, useSearchParams } from 'next/navigation'
import Link from 'next/link' // CSR

const ListContainer = () => {
  const params = useParams()
  console.log('CSR 경로변수:', params)

  const searchParams = useSearchParams()
  console.log('CSR 쿼리스트링:', searchParams.toString())
  return (
    <>
      <h1>목록</h1>
      <Link href="/">메인페이지(CSR)</Link>
      <a href="/">메인페이지(SSR)</a>
    </>
  )
}

export default ListContainer
