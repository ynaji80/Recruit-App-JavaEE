package com.app.dao;

import com.app.models.Candidate;

public interface CandidateDAO {
    public int verifyLogin(String email, String password);
    public Candidate getCandidateByEmail(String email);
    public int addCandidate(Candidate candidate);
    public int emailExist(String email);
    public int hasPost(int id);
    public Candidate getCandidateById(int idCandidat);
    public int updateCandidate(Candidate candidate);
}
