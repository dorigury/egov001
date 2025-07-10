package hello.egov001.domain.sample.service;

import hello.egov001.domain.sample.model.Sample;
import hello.egov001.domain.sample.repository.SampleRepository;
import hello.egov001.domain.sample.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class SampleService {

    private final SampleRepository sampleRepository;

    public Sample insert(Sample sample) {
        return sampleRepository.save(sample);
    }

    public Sample update(Sample sample) {
        return sampleRepository.save(sample);
    }

    public void delete(Sample sample) {
        sampleRepository.delete(sample);
    }

    @Transactional(readOnly = true)
    public long count() {
        return sampleRepository.count();
    }
}
