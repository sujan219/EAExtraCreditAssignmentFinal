package cs544.extra.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="ROLE_ADMIN")
public class Admin extends User {
	
}
