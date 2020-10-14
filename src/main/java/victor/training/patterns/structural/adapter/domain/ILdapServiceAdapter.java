package victor.training.patterns.structural.adapter.domain;

import java.util.List;

public interface ILdapServiceAdapter {

	List<User> searchByUserName(String username);

}