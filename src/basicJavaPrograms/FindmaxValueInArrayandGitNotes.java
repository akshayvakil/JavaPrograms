package basicJavaPrograms;

public class FindmaxValueInArrayandGitNotes {

	/**
	 *  Basic git commands https://confluence.atlassian.com/bitbucketserver/basic-git-commands-776639767.html  
	 * git add *
	 * git commit -m "commit message"
	 * git checkout -b develop
	 * git checkout branchname  [to switch to branch]
	 * git branch -d developbranchname OR git branch -D branchname OR git push origin --delete branchname
	 * >git config --global core.autocrlf true
	 * @param args
	 *
	 * Merge Solving 
	 * code between HEAD and == is your code
	 * code from develop and above till ==== is your new code, discussion save file and then git add , commit and push to solve merge
	 * If you are one of the branch pushed means next to commit
	 * use git fetch origin command then solve by above appraoch
	 * 
	 * How to merge develop branch with master branch
	 * switch to branch
	 * git checkout master
	 * git merge develop 
	 * 
	 * 
	 * When you use git remote -v  --to view remote repositories, 
	 * you see two URLs listed for each remote: a fetch URL and a push URL. Here’s what each URL represents:
	 * 
	 * Code to revert code from remote git repo
	 * # Step 1: Fetch latest changes
git fetch origin

# Step 2: Identify the commit to revert
git log -n 5

# Step 3: Revert the commit locally
git revert abcdef1234567890

# Step 4: Resolve any merge conflicts (if any)
git status
# Resolve conflicts in conflicted files
git add <resolved_file>
git commit

# Step 5: Commit the revert
git commit

# Step 6: Push the revert commit to remote
git push origin master

	 * 
	 */


	public static void main(String[] args) {
		
		// This is master branch
		int[] intarr = { 10, 2, 3, 30, 12 };
		// Find max value comment added from develop branch 
		
// Find Max Value in array		
		int max = intarr[0];
		for (int i = 0; i < intarr.length; i++) {
			if (intarr[i] > max) {
				max = intarr[i];
			}
		}
		System.out.println("Max Value is -->"+max);
// Find Min Value in array
		int minValue =intarr[0];
		
	for (int j=intarr.length-1;j>=0;j--)
	{
		if (intarr[j]<minValue)
		{
			minValue=intarr[j];
		}
		
	}
	System.out.println("Min Value is -->"+minValue);	

		
		
		
	}

	
	
}
