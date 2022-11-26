package com.mandu.yamyam.comm.mapper;

import java.util.List;

import com.mandu.yamyam.comm.service.ActVO;
import com.mandu.yamyam.comm.service.BOMVO;
import com.mandu.yamyam.comm.service.CommVO;
import com.mandu.yamyam.comm.service.CommdVO;
import com.mandu.yamyam.comm.service.MtrVO;
import com.mandu.yamyam.comm.service.PrdVO;

public interface CommMapper {

	// ajax 공통코드 불러오기
	public List<CommVO> ajaxSelectComm();
	
	// ajax 상세 공통 코드 불러오기
	public List<CommdVO> ajaxSelectDetailComm(CommdVO commdVO);

	// ajax 상세 공통 코드 등록
	public int ajaxInsertDetailComm(CommdVO commdVO);
	
	// ajax 상세 공통 코드 삭제
	public int ajaxDeleteDetailComm(CommdVO commdVO);
	
	// ajax 공통 코드 등록
	public int ajaxInsertComm(CommVO commVO);
	
	// 상세 공통 코드, 이름 불러오기(성하)
	public List<CommdVO> getCommdCdNm(String commCd);
	
	
	// ajax 자재 코드 불러오기
	public List<MtrVO> ajaxSelectMat();	
	// ajax 자재탭 - 거래처 코드(모달) 불러오기
	public List<ActVO> ajaxSelectModalAct();
	// ajax 자재 - 자재 단건 정보 가져오기
	public MtrVO ajaxSelectMtrInfo(MtrVO mtrVO);
	
	
	
	// ajax 거래처 코드 불러오기
	public List<ActVO> ajaxSelectAct();
	
	
	// ajax 완제품 코드 불러오기
	public List<PrdVO> ajaxSelectPrd(PrdVO prdVO);
	
	
	// ajax BOM 코드 불러오기
	public List<BOMVO> ajaxSelectBOM();
	// ajax BOM 제품목록(모달창)
	public List<PrdVO> ajaxSelectModalBOM();
}
