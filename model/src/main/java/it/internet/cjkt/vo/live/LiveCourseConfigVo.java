package it.internet.cjkt.vo.live;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.internet.cjkt.model.live.LiveCourseConfig;
import it.internet.cjkt.model.live.LiveCourseGoods;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(description = "LiveCourseConfig")
public class LiveCourseConfigVo extends LiveCourseConfig {

	@ApiModelProperty(value = "商品列表")
	private List<LiveCourseGoods> liveCourseGoodsList;
}