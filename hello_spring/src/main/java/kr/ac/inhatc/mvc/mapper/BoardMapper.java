package kr.ac.inhatc.mvc.mapper;

import java.util.List;

public interface BoardMapper {
	public String getName() throws Exception;
	List<?> selectSubjectList(String name) throws Exception;
}
