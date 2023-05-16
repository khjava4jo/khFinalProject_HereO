package com.hereo.project.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.hereo.project.vo.BatterBoxEventVO;
import com.hereo.project.vo.MatchBatterBoxEventVO;
import com.hereo.project.vo.MatchInningVO;
import com.hereo.project.vo.MatchParticipateVO;
import com.hereo.project.vo.MatchRecordVO;
import com.hereo.project.vo.MatchScheduleVO;
import com.hereo.project.vo.MembersVO;
import com.hereo.project.vo.PlayerVO;
import com.hereo.project.vo.PlayerRecordHitterVO;
import com.hereo.project.vo.TeamPlayerVO;
import com.hereo.project.vo.TeamVO;

public interface RecordDAO {

	ArrayList<PlayerRecordHitterVO> selectAllHitRecord();

	MatchRecordVO selectMatchRecordByMrNum(int mr_num);

	ArrayList<MatchParticipateVO> selectMatchPartInHome(int mr_num);

	ArrayList<MatchParticipateVO> selectMatchPartInAway(int mr_num);

	PlayerRecordHitterVO selectPlayerRecordHitterByTpNumAndMrNum(@Param("tp_num")Integer tp_num, @Param("mr_num")Integer mr_num);

	PlayerRecordHitterVO selectPlayerRecordPitcherByTpNumAndMrNum(@Param("tp_num")Integer tp_num, @Param("mr_num")Integer mr_num);

	ArrayList<BatterBoxEventVO> getAllBatterBoxEventList();

	MatchRecordVO selectMatchRecordByMsNum(int ms_num);

	int insertMatchRecord(@Param("mr")MatchRecordVO matchRecord);

	int updateMatchRecord(@Param("mr")MatchRecordVO matchRecord);

	ArrayList<MatchInningVO> selectMatchInningByMrNum(int mr_num);

	void deleteMatchInning(int mr_num);

	int insertMatchInning(@Param("mi")MatchInningVO tmpInning);

	void insertMatchBBE(@Param("mb")MatchBatterBoxEventVO tmpBBE, @Param("mr_num")Integer mr_num);

	void insertMatchParticipate(@Param("mp")MatchParticipateVO tmpPart);

	void deleteMatchParticipate(Integer mr_num);

	


}
