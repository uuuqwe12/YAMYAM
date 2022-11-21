package com.mandu.yamyam.pro.service;

import java.util.List;
import java.util.Map;


public interface ProService {
	// 입력될 생산 우선순위 조회
	public int getPrioNo();
	/*---------------
	// 생산 계획 관리(관리탭)
	----------------*/
	
	// 생산계획 조회
	public List<ProVO> getPlan(ProVO vo);
	
	// 상세생산계획조회
	public List<ProVO> planDetail(ProVO vo);
	
	// 생산계획 등록
	public int insertPlan(List<ProVO> vo);
	
	// 상세생산계획 수정 (작업우선순위, 생산일자)
	public int updatePlanDetail(List<ProVO> vo);
	
	// 상세생산계획 삭제
	public int deletePlanDetail(List<ProVO> vo);
	
	
	/*---------------
	// 생산 계획 관리(관리탭)
	----------------*/
	// 생산요청서 목록 조회
	public List<Map<String,Object>> orderList();
	
	// 제품목록 조회
	public List<Map<String,Object>> materialList();
}