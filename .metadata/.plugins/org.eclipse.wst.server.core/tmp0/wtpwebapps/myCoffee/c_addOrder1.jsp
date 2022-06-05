<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>WCB Cafe - MENU</title>
		<meta name="discription" content="is very good coffee shop"/>
		
		 <link rel="icon" type="image/png" href="images/favicon.png">
		 <meta name="viewport" content="width=device-width, initial-scale=1">
	 <!-- CSS -->
        <link rel="stylesheet" href="https://unpkg.com/ress/dist/ress.min.css">
        <link href="https://fonts.googleapis.com/css?family=Philosopher" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
</head>
<body>
<form action="c_OrderConfirm.jsp" method="post">

      <div id="menu" class="big-bg">
          <header class="page-header wrapper">
              <h1><a href="index.html"><img class="logo" src="images/logo.svg" alt="WCB Cafe 首頁"></a></h1>
              <nav>
                  <ul class="main-nav">
                      <li><a href="news.html">News</a></li>
                      <li><a href="c_addOrder1.jsp">Menu</a></li>
                      <li><a href="contact.html">Contact</a></li>
                  </ul>
              </nav>
          </header>

          <div class="menu-content wrapper">
              <h2 class="page-title">Menu</h2>
              <p>
                  WCB CAFE提供有益健康的自然食物，主要的特色是菜單選用了無人工添加物的食材。
                  請用好喝的綜合咖啡與健康的有機食物由體內開始療癒身心。
              </p>
          </div><!-- /.menu-content -->
      </div><!-- /#menu -->

      <!-- ↓ 增加這個部分 ↓ -->
      
      
   			<div class="container">
	          
   				 <tr>
					<td colspan=3>
					<div class="item1">
						<p>請選桌號
					</div>
					<select name="desk" class="inputorder" style="font-size:25px">			
							<option value="A桌">A桌▼
							<option value="B桌">B桌▼
							<option value="C桌">C桌▼		
							<option value="D桌">D桌▼
							<option value="E桌">E桌▼
							<option value="外帶">外帶▼				
					</select>				
			 </div>	
						 
      <div class="wrapper grid">
          <div class="item big-box">
              <img src="images/menu1.jpg" alt="">
              <p>1號(A) 黑咖啡 &emsp;&emsp; NT$150 &emsp; 數量<input class="inputorder"  type="number" name="A" value="0" step="1" min="0" max="100" />  
        	 <!-- 1號=A -->
          </div>
          <div class="item">
              <img src="images/menu2.jpg" alt="">
              <p>2號(B)  那堤 &emsp;&emsp; NT$180</>  <!-- 2號=B -->
              <p>數量 &emsp; <input class="inputorder"  type="number" name="B" value="0" step="1" min="0" max="100" ></p> 
          </div>
          <div class="item">
              <img src="images/menu3.jpg" alt="">
              <p>3號(C) 香橙檸檬塔 &emsp;&emsp; NT$80</>  
              <p>數量 &emsp; <input class="inputorder"  type="number" name="C" value="0" step="1" min="0" max="100" ></p> 
          </div>
          <div class="item">
              <img src="images/menu4.jpg" alt="">
              <p>4號 新產待續 &emsp;&emsp;&emsp; NT$</>  
              <p>數量 &emsp; <input class="inputorder"  type="number" name="D" value="0" step="1" min="0" max="100" ></p> 
          </div>
          <div class="item">
              <img src="images/menu5.jpg" alt="">
              <p>5號 新產待續 &emsp;&emsp;&emsp; NT$</>  
              <p>數量 &emsp; <input class="inputorder"  type="number" name="E" value="0" step="1" min="0" max="100" ></p> 
          </div>
          <div class="item">
              <img src="images/menu6.jpg" alt="">
               <p>6號 新產待續 &emsp;&emsp;&emsp; NT$</>  
               <p>數量 &emsp; <input class="inputorder"  type="number" name="F" value="0" step="1" min="0" max="100" ></p> 
          </div>
          <div class="item">
              <img src="images/menu7.jpg" alt="">
              <p>7號 新產待續 &emsp;&emsp;&emsp; NT$</>  
              <p>數量 &emsp; <input class="inputorder"  type="number" name="G" value="0" step="1" min="0" max="100" ></p> 
              
          </div>
          <div class="item">
              <img src="images/menu8.jpg" alt="">
               <p>8號 新產待續 &emsp;&emsp;&emsp; NT$</>  
              <p>數量 &emsp; <input class="inputorder"  type="number" name="H" value="0" step="1" min="0" max="100" ></p> 
          </div>
          <div class="item">
              <img src="images/menu9.jpg" alt="">
               <p>9號 新產待續 &emsp;&emsp;&emsp; NT$</>  
              <p>數量 &emsp; <input class="inputorder"  type="number" name="I" value="0" step="1" min="0" max="100" ></p> 
          </div>
         
        
      </div><!-- /.grid -->

      <!-- ↑ 到這裡為止 ↑ -->
     
	 	 <div class="container">
	           <div class="item1">
				<input class="buttonSmall" type="submit" value="確認">				
	           </div>
         </div>
        
      <footer>
          <div class="wrapper">
              <p><small>&copy; 2022 Manabox</small></p>
              <p><small><a href="./mvc/case02/time/now"><span style="color:orange;">員工登入</span></a></small></p>
          </div>
      </footer>

</form>		
</body>
</html>
