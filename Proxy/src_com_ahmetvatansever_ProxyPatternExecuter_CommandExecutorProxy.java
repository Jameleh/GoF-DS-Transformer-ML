package com.ahmetvatansever.ProxyPatternExecuter;

public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user, String pwd){
        if("Ahmet".equals(user) && "Vatansever".equals(pwd)) {
            isAdmin = true;
            executor = new CommandExecutorImpl();
        }
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if(isAdmin){
            System.out.println("isAdmin:" + isAdmin);
            executor.runCommand(cmd);
        }else{
            if(cmd.trim().startsWith("rm")){
                throw new Exception("rm command is not allowed for non-admin users.");
            }else{
                executor.runCommand(cmd);
            }
        }
    }

}