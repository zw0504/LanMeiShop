/*项目列表点击时进行显示页面*/
$(function(){
	/*页面刷新时全部隐藏*/
	$(".adminManagerPageDiplay").hide();
	/*类别管理*/
	$("#categoryManagerItem").click(function(){
		$(".commopdityManagerPageDiplay").hide();
		$("#categoryManagerItemPage").show();
	});
	/*查询编辑商品*/
	$("#commodityQueryItem").click(function(){
		$(".commopdityManagerPageDiplay").hide();
		$("#commodityQueryItemPage").show();
	});
	/*增添商品*/
	$("#addCommodityItem").click(function(){
		$(".commopdityManagerPageDiplay").hide();
		$("#addCommodityItemPage").show();
	});
	/*删除商品*/
	$("#deleteCommodityItem").click(function(){
		$(".commopdityManagerPageDiplay").hide();
		$("#deleteCommodityItemPage").show();
	});	
});