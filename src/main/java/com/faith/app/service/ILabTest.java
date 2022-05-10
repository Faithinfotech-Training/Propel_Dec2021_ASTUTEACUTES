package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.entity.LabTest;

public interface ILabTest {

	List<LabTest> getLabtest();

	void saveLabTest(LabTest labTest);

	Optional<LabTest> getLabTest(int theId);

	void deleteLabTest(int theId);

}
