package kr.co.rice.mapper;

import java.util.ArrayList;

import kr.co.rice.vo.ProductVo;

public interface SearchMapper {

	public ArrayList<ProductVo> list(String search);
}
