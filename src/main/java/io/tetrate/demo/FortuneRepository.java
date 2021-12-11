package io.tetrate.demo;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by azwickey on 1/12/18.
 */
public interface FortuneRepository extends CrudRepository<Fortune,Long> {
}
