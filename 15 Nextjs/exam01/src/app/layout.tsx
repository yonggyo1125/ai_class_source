export default function RootLayout({
  children,
}: Readonly<{
  children: React.ReactNode
}>) {
  return (
    <html lang="en">
      <body>
        <header>상단 헤더 영역</header>
        {children}
        <footer>하단 푸터 영역</footer>
      </body>
    </html>
  )
}
