<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://unpkg.com/purecss@2.0.6/build/pure-min.css">
 <!-- CSS -->
        <link rel="stylesheet" href="https://unpkg.com/ress/dist/ress.min.css">
        <link href="https://fonts.googleapis.com/css?family=Philosopher" rel="stylesheet">
        <link href="css/case02.css" rel="stylesheet">
	<meta charset="UTF-8">
	<style type="text/css">
		.item{
			margin: 100px
			padding: 100px
		}
		.container{
			display:flex;
		}
						
	</style>
	<title>Show Lotto</title>
</head>
<body style="padding: 15px" >
		
			<form class="pure-form" method="post" action="./add">
		    <fieldset>
		        <button type="submit" class="pure-button pure-button-primary" >
		        	電腦選號
		        </button>
		    </fieldset>
		    </form>
	<div class="container">				    
		 <div class="item">
			   <table  class="pure-table pure-table-bordered" >
				 	<thead >
				    	<tr>
				    		<th>index</th><th>餐點號碼</th><th>修改</th><th>刪除</th>
				    	</tr>	
				    </thead>
				    <tbody>
				    	<c:forEach varStatus="status" var="lotto" items="${ lottos }">
				    		<tr>
				    			<td>${ status.index }</td><td>${ lotto }</td>
				    			<td>
				    				<button type="button" 
				    						onclick="window.location.href='./update/${status.index}';"
				    						class="pure-button pure-button-primary">
				        				修改
				        			</button>
				    			</td>
				    			<td>
				    				<button type="button" 
				    						onclick="window.location.href='./delete/${status.index}';"
				    						class="pure-button pure-button-primary">
				        				刪除
				        			</button>
				    			</td>
				    		</tr>
				    	</c:forEach>
				    </tbody>		    	   
			   </table>	
		    </div>
										<div>
											<tr>
												<td>  &emsp; &emsp;&emsp;  </td>	    	
											</tr>		  
										</div>
	   
		   <div class="item">
			 <table  class="pure-table pure-table-bordered" >
				 	<thead>
				    	<tr>
				    		<th>餐點號碼</th><th>產品名稱</th><th>說明</th>
				    	</tr>	
				    </thead>
				    
				    <tbody>
				    	<tr>
				    		<th>1號</th><th>黑咖啡</th><th>咖啡的講究，就是這麼單醇與濃烈。 100%阿拉比卡豆，100%雨林聯盟認證， 新鮮研磨、Espresso濃縮咖啡香醇萃取， 面對複雜的世界，要單純，很難！ 專注做一件事，夠單醇，才敢簡單！ 純粹就是好的黑咖啡。</th>
				    	</tr>	
				    				    
				    </tbody>	
				    
				    <tbody>
				    	<tr>
				    		<th>2號</th><th>那堤</th><th>香醇的牛奶搭配咖啡，陪你迎接美好一天。 通過雨林聯盟認證的100%阿拉比卡豆， 新鮮研磨成香醇濃縮咖啡，注入新鮮牛奶， 再蓋上選用高品質的香濃鮮奶打成的綿密奶泡， 細緻到幾乎看不到氣泡，搖晃起來呈濃稠質感。 喝一口，享受綿密親吻與完美比例的香醇。</th>
				    	</tr>				    
				    </tbody>	
				    <tbody>
				    	<tr>
				    		<th>3號</th><th>橙香塔</th><th>這個法式香橙塔的味道超棒 ♥ 喜歡新鮮水果派的朋友，現榨的柳橙香味和濃密的內餡口感是這款甜點最吸引人的地方喔！</th>
				    	</tr>				    
				    </tbody>	
				    <tbody>
				    	  
				    </tbody>	
			</table>
	
		
   		</div>
   </div>			 
   
</body>
</html>