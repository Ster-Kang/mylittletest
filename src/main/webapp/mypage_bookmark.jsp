<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="./include/head.jsp"></jsp:include>
<style>
	.mypage_container{
		display: inline-flex;
    	margin-left: 120px;
   		width: fit-content;
        background-color: #474747;
        padding: 1.5rem 2rem 2rem 2rem;
        height:750px; 
        gap:50px;
        border: 1px solid black;
	}
	.profile_box{
		height:fit-content;
		width: 300px;
	}
	.picture{
		text-align:center;
		font-size:100px;
	}
	.profile{
		text-align:center;
		border: 1px solid black;
		border-radius:30px;
	}
	.change{
		color:#cccccc;
		font-size:12px;
	}
	.nickname, .email{
		margin-top:20px;
	}
	.password{
		appearance: none;
		background-color: #333333;
		color: #ffffff;
		border-radius: 10px;
		height: 3rem;
		width: 150px;
		justify-content: center;
		align-items: center;
		font-size: 1rem;
		text-align:center;
		display:flex;
		cursor:pointer;
		border: none;
		margin-top:30px;
		margin-left:75px;
	}
	.sub_menu{
		text-align:center;
		margin-top:80px;
	}
	.bookmark_list_btn,.alarm_list_btn{
		background-color: #333333;
		color: #ffffff;
		height: 4rem;
		width: 300px;
		margin-top:30px;
		cursor:pointer;
		justify-content: center;
		align-items: center;
		display:flex;
		border-radius:20px;
	}
	.bookmark_container{
		display:flex;
		width:1000px;
		gap:30px;
	}
	.bookmark_list{
		border:1px solid black;
		margin:20px;
		width:950px;
		margin-top:0px;
		border-radius:20px;
	}
	.bookmark_header{
		display:flex;
		gap:150px;
	}
	.bookmark_title{
		margin-left:20px;
		font-size:30px;
		font-weight:bold;
		margin-top:20px;
	}
	.search_area{
		margin-top:20px;
	}
	.search_items {
		height: 20px;
		width: 400px;
		background: #474747;
		border-radius: 20px;
		padding: 10px;
		border: 1px solid #cccccc;
	}
	.search_input{
		border:none;
		background:none;
		outline:none;
		float:left;
		padding:0px;
		color:#white;
		font-size:16px;
		width:200px;
	}
	.search_button {
		color:#474747;
		float:right;
		width:40px;
		height:100%;
		border-radius: 50%;
		background: #474747;
		border:none;
		font-size:16px;
		display:flex;
		justify-content:center;
		align-items:center;
		
	}
	.bookmark_btn{
		display:flex;
		gap:10px;
		height:40px;
		margin-top:35px;
		margin-left:20px;
	}
	.all_btn{
		appearance: none;
		background-color: #333333;
		color: #ffffff;
		border-radius: 10px;
		height: 50px;
		width: 130px;
		justify-content: center;
		align-items: center;
		font-size: 17px;
		text-align:center;
		display:flex;
		cursor:pointer;
		border: none;	
		font-weight:bold;
	}
	.bookmark_main{
		margin:30px;
		width:900px;	
	}
	.bookmark{
		display:flex;
		border-bottom: 1px solid #cccccc;
	}
	.bookmark_note{
		margin-top:10px;
		display:flex;
		border-bottom: 1px solid #cccccc;
		height:28px;
	}
	
</style>

<div class="mypage_container">
	<div class="profile_box">
		<div class="profile">
			<div class="picture">
				🤡
				<div class="change" id="picture_change">변경하기</div>
			</div>
			<div class="nickname">
				USER_NICKNAME
				<div class="change" id="nickname_change">변경하기</div>
			</div>
			<div class="email">
				user@email.com
				<div class="change" id="email_change">변경하기</div>
			</div>
			<div class="password" id="password_change">비밀번호 변경</div>
			<div class="change" style="margin-top:15px; margin-bottom:15px;">계정비활성화</div>
		</div>
		<div class="sub_menu">
			<div class="bookmark_list_btn" onclick="location.href='mypage_bookmark.jsp'">즐겨찾기 & 북마크 목록</div>
			<div class="alarm_list_btn" style="margin-top:50px;" onclick="location.href='mypage_alarm.jsp'">알림 목록</div>
		</div>	
	</div>
	<div class="bookmark_container">
		<div class="bookmark_list">
			<div class="bookmark_header">
				<div class="bookmark_title">즐겨찾기 & 북마크목록</div>
				<div class="search_area">
            		<form class="search_items">
               		 	<input class="search_input" type="text" placeholder="Search" spellcheck="false">
               		 	<button class="search_button" type="button">🔍</button>
            		</form>
	       		</div>
			</div>
			<div class="bookmark_btn">
				<div class="all_btn">전체 선택</div>
				<div class="all_btn">즐겨찾기 해제</div>
			</div>
			<div class="bookmark_main">
				<div class="bookmark">
						<div class="sub" style="width:50px; font-size:20px; font-weight:bold;">✔</div>
						<div class="sub" style="width:150px; font-size:20px; font-weight:bold;">유형 분류</div>
						<div class="sub" style="width:150px; font-size:20px; font-weight:bold;">문제 분류</div>
						<div class="sub" style="width:350px; font-size:20px; font-weight:bold;">내용</div>
						<div class="sub" style="width:200px; font-size:20px; font-weight:bold;">시간</div>
					</div>
					<div class="bookmark_note">
						<div class="check"style="width:50px;"><input type="checkbox"></div>
						<div class="sub" style="width:150px; font-size:17px;">즐겨찾기</div>
						<div class="sub" style="width:150px; font-size:17px;">JAVA</div>
						<div class="sub" style="width:350px; font-size:17px; overflow:hidden"></div>
						<div class="sub" style="width:200px; font-size:17px;">2024-07-02 12:13:45</div>
					</div>
					<div class="bookmark_note">
						<div class="check"style="width:50px;"><input type="checkbox"></div>
						<div class="sub" style="width:150px; font-size:17px;">즐겨찾기</div>
						<div class="sub" style="width:150px; font-size:17px;">HTML</div>
						<div class="sub" style="width:350px; font-size:17px; overflow:hidden"></div>
						<div class="sub" style="width:200px; font-size:17px;">2024-07-02 12:13:45</div>
					</div>
					<div class="bookmark_note">
						<div class="check"style="width:50px;"><input type="checkbox"></div>
						<div class="sub" style="width:150px; font-size:17px;">북마크</div>
						<div class="sub" style="width:150px; font-size:17px;">JSP</div>
						<div class="sub" style="width:350px; font-size:17px; overflow:hidden">JSP에서 ** 과 비슷하게 생긴,JSP에서 ** 과 비슷하게 생긴JSP에서 ** 과 비슷하게 생긴</div>
						<div class="sub" style="width:200px; font-size:17px;">2024-07-02 12:13:45</div>
					</div>
					<div class="bookmark_note">
						<div class="check"style="width:50px;"><input type="checkbox"></div>
						<div class="sub" style="width:150px; font-size:17px;">북마크</div>
						<div class="sub" style="width:150px; font-size:17px;">JSTL</div>
						<div class="sub" style="width:350px; font-size:17px; overflow:hidden">JSP에서 ** 과 비슷하게 생긴,JSP에서 ** 과 비슷하게 생긴JSP에서 ** 과 비슷하게 생긴</div>
						<div class="sub" style="width:200px; font-size:17px;">2024-07-02 12:13:45</div>
					</div>
					<div class="bookmark_note">
						<div class="check"style="width:50px;"><input type="checkbox"></div>
						<div class="sub" style="width:150px; font-size:17px;">북마크</div>
						<div class="sub" style="width:150px; font-size:17px;">CSS</div>
						<div class="sub" style="width:350px; font-size:17px; overflow:hidden">JSP에서 ** 과 비슷하게 생긴,JSP에서 ** 과 비슷하게 생긴JSP에서 ** 과 비슷하게 생긴</div>
						<div class="sub" style="width:200px; font-size:17px;">2024-07-02 12:13:45</div>
					</div>
					<div class="bookmark_note">
						<div class="check"style="width:50px;"><input type="checkbox"></div>
						<div class="sub" style="width:150px; font-size:17px;">즐겨찾기</div>
						<div class="sub" style="width:150px; font-size:17px;">EL</div>
						<div class="sub" style="width:350px; font-size:17px; overflow:hidden"></div>
						<div class="sub" style="width:200px; font-size:17px;">2024-07-02 12:13:45</div>
					</div>
					<div class="bookmark_note">
						<div class="check"style="width:50px;"><input type="checkbox"></div>
						<div class="sub" style="width:150px; font-size:17px;">즐겨찾기</div>
						<div class="sub" style="width:150px; font-size:17px;">Javascript</div>
						<div class="sub" style="width:350px; font-size:17px; overflow:hidden">JSP에서 ** 과 비슷하게 생긴,JSP에서 ** 과 비슷하게 생긴JSP에서 ** 과 비슷하게 생긴</div>
						<div class="sub" style="width:200px; font-size:17px;">2024-07-02 12:13:45</div>
					</div>
					<div class="bookmark_note">
						<div class="check"style="width:50px;"><input type="checkbox"></div>
						<div class="sub" style="width:150px; font-size:17px;">즐겨찾기</div>
						<div class="sub" style="width:150px; font-size:17px;">Jquery</div>
						<div class="sub" style="width:350px; font-size:17px; overflow:hidden"></div>
						<div class="sub" style="width:200px; font-size:17px;">2024-07-02 12:13:45</div>
					</div>
					<div class="bookmark_note">
						<div class="check"style="width:50px;"><input type="checkbox"></div>
						<div class="sub" style="width:150px; font-size:17px;">즐겨찾기</div>
						<div class="sub" style="width:150px; font-size:17px;">Javascript</div>
						<div class="sub" style="width:350px; font-size:17px; overflow:hidden">JSP에서 ** 과 비슷하게 생긴,JSP에서 ** 과 비슷하게 생긴,JSP에서 ** 과 비슷하게 생긴</div>
						<div class="sub" style="width:200px; font-size:17px;">2024-07-02 12:13:45</div>
					</div>
					<div class="bookmark_note">
						<div class="check"style="width:50px;"><input type="checkbox"></div>
						<div class="sub" style="width:150px; font-size:17px;">즐겨찾기</div>
						<div class="sub" style="width:150px; font-size:17px;">EL</div>
						<div class="sub" style="width:350px; font-size:17px; overflow:hidden"></div>
						<div class="sub" style="width:200px; font-size:17px;">2024-07-02 12:13:45</div>
					</div>
				</div>
				<div class="page" style="text-align:center;"> ◀ 1  2  3  4  5  6  7  8  9  10  ▶  </div>
			</div>
		</div>
	</div>


<jsp:include page="./include/tail.jsp"></jsp:include>