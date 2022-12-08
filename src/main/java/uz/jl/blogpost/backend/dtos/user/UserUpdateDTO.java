package uz.jl.blogpost.backend.dtos.user;

import lombok.*;
import uz.jl.blogpost.backend.dtos.GenericDto;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserUpdateDTO extends GenericDto {

	private String id;
	private String updatedBy;

	@NonNull
	private String fullName;

	@NonNull
	private String username;

	@NonNull
	private String password;

	@NonNull
	private String email;

}
