<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<style>


.container2 {
  display: flex;
  width: 80%;
  height: 80%;
  background-color: #fff;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
  border-radius: 10px;
}

.left-side {
  flex: 1;
  background-color: #eaeaea;
  border-radius: 10px 0 0 10px;
  overflow: hidden;
}

#map {
  width: 100%;
  height: 100%;
}

.right-side {
  flex: 1.5;
  padding: 20px;
  display: flex;
  flex-direction: column;
  justify-content: center;
}

.right-side h2 {
  font-size: 24px;
  margin-bottom: 10px;
}

.right-side p {
  font-size: 16px;
  margin-bottom: 15px;
}

.ads {
  margin-bottom: 20px;
}

button {
  padding: 10px 20px;
  font-size: 16px;
  background-color: #007bff;
  color: white;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  transition: background-color 0.3s;
}

button:hover {
  background-color: #0056b3;
}
</style>

<section>
<div class="container2">
    <!-- 지도 앱 -->
    <div class="left-side">
      <div id="map"></div> <!-- 지도 API를 여기서 구현 -->
    </div>
    
    <!-- 콘서트 정보 -->
    <div class="right-side">
      <h2>크리스마스 지브리 OST 콘서트</h2>
      <p>가는 곳: 서울시 송파구 올림픽로 300 롯데월드몰 8층 롯데콘서트홀</p>
      <p>디 오케스트라 - 서울</p>
      
      <div class="ads">
        <p>광고</p>
      </div>
      
      <button onclick="window.location.href='https://www.lotteconcerthall.com/kor/Performance/ConcertDetails/260544'">예매하러가기</button>
    </div>
  </div>

  <!-- 지도 API 스크립트 삽입 (예: 구글 지도 API) -->
  <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_API_KEY&callback=initMap" async defer></script>
  <script src="script.js"></script>
</section>