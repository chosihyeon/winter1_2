<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <style>
        /* 상단 네비게이션 바 */
        header {
            display: flex;
            align-items: center;
            justify-content: space-between; /* 요소 간 공간 분배 */
            background-color: #97BFB4;
            padding: 20px 40px;
            border-bottom: 4px solid #DD4A48;
            color: white;
            flex-wrap: nowrap;
        }

        /* 로고 및 왼쪽 네비게이션 그룹 */
        .logo-nav {
            display: flex;
            align-items: center;
            gap: 25px;
        }

        /* 로고 스타일 */
        .logo img {
            width: 80px;
            height: auto;
        }

        /* 검색 바 */
        .search-bar {
            display: flex;
            align-items: center;
            margin: 0 auto; /* 검색 바를 중앙으로 */
        }

        .search-bar input {
            padding: 10px 15px;
            margin-right: 15px;
            border-radius: 4px;
            border: 2px solid #388E3C; /* 녹색 테두리 */
            background-color: #A5D6A7;
            color: #333333;
            font-size: 14px;
        }

        .search-bar input::placeholder {
            color: #607D8B;
        }

        .search-bar button {
            padding: 10px 20px;
            background-color: #DD4A48;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 14px;
            transition: background-color 0.3s ease; /* 부드러운 hover 효과 */
        }

        .search-bar button:hover {
            background-color: #4F091D;
        }

        /* 네비게이션 링크 */
        .nav-links {
            display: flex;
            gap: 20px; /* 요소 간격 */
        }

        .nav-links a {
            text-decoration: none;
            color: #FFFFFF;
            font-weight: bold;
            font-size: 16px;
            transition: color 0.3s ease;
        }

        .nav-links a:hover {
            color: #DD4A48;
        }
    </style>

    <header>
        <!-- 로고 및 영화/코멘트 링크 그룹 -->
        <div class="logo-nav">
            <div class="logo">
                <img src="/MovieReviewPj/resources/images/GHIBLIPedia.svg" alt="Ghibli Pedia Logo">
            </div>
            <nav class="nav-links">
                <a href="/MovieReviewPj/index.jsp">영화</a>
                <a href="/MovieReviewPj/comment/list.do">코멘트</a>
            </nav>
        </div>

        <!-- 검색 바 -->
        <div class="search-bar">
            <input type="text" placeholder="지브리컨텐츠를 검색해보세요...">
            <button>검색</button>
        </div>

        <!-- 회원가입 및 로그인 링크 -->
        <nav class="nav-links">
            <a href="/MovieReviewPj/user/register.do">회원가입</a>
            <a href="/MovieReviewPj/user/login.do">로그인</a>
        </nav>
    </header>
