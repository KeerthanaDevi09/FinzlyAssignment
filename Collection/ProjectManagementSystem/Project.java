package Collection.project;

import java.util.HashSet;
import java.util.Set;

public class Project {
	private int projectId;
	private String projectName;
	private String describtion;
	private Set<String> teamMembers;
	
	
	public Project(int projectId, String projectName, String describtion) {
		this.projectId = projectId;
		this.projectName = projectName;
		this.describtion = describtion;
		this.teamMembers= new HashSet<>();
	}
	public int getProjectId() {
		return projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public String getDescribtion() {
		return describtion;
	}
	public Set<String> getTeamMembers() {
		return teamMembers;
	}
	
	public void addTeamMember(String teamMemberName) {
		teamMembers.add(teamMemberName);
	}
	
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", describtion=" + describtion
				+ ", teamMembers=" + teamMembers + "]";
	}
	
	
	
	
	

}
