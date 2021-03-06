package gamedev.td;

import gamedev.screen.GDScreen;
import gamedev.screen.GameOverScreen;
import gamedev.screen.GameScreen;
import gamedev.screen.GameWinScreen;
import gamedev.screen.LvlSelectScreen;
import gamedev.screen.MainMenuScreen;
import gamedev.screen.PauseScreen;
//added (2017.02.23 by Yeseul Cho)
import gamedev.screen.SettingScreen;
import gamedev.screen.AboutScreen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

public class TowerDefense extends Game {

	//add(2017.02.15 11:18 By ChoYoungIn)
	//GameWinScreen
	
	private MainMenuScreen mainMenuScreen;
	private GameOverScreen gameOverScreen;
	private GameScreen gameScreen;
	
	//add(2017.02.15 11:18 By ChoYoungIn)
	private GameWinScreen gameWinScreen;
	
	private PauseScreen pauseScreen;
	private LvlSelectScreen lvlSelectScreen;
	//added (2017.02.23 by Yeseul Cho)
	private SettingScreen settingScreen;
	private AboutScreen aboutScreen;
	
	@Override
	public void create () {
		mainMenuScreen = new MainMenuScreen(this);
		gameScreen = new GameScreen(this);
		gameOverScreen = new GameOverScreen(this);
		
		//add(2017.02.15 11:18 By ChoYoungIn)
		gameWinScreen = new GameWinScreen(this);
		
		setLvlSelectScreen(new LvlSelectScreen(this));
		setPauseScreen(new PauseScreen(this));
		//added (2017.02.23 by Yeseul Cho)
		setSettingScreen(new SettingScreen(this));
		setAboutScreen(new AboutScreen(this));
		
		switchScreen(mainMenuScreen);
	}
	
	public void switchScreen(GDScreen screen){
		setScreen(screen);
		Gdx.input.setInputProcessor(screen.getInputProcessor());
		
	}

	@Override
	public void render () {
		super.render();
		
		
	}
	
	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void resume() {
		super.resume();
	}

	public MainMenuScreen getMainMenuScreen() {
		return mainMenuScreen;
	}

	public void setMainMenuScreen(MainMenuScreen mainMenuScreen) {
		this.mainMenuScreen = mainMenuScreen;
	}

	public GameScreen getGameScreen() {
		return gameScreen;
	}

	public void setGameScreen(GameScreen gameScreen) {
		this.gameScreen = gameScreen;
	}

	public GameOverScreen getGameOverScreen() {
		return gameOverScreen;
	}
	
	//add(2017.02.15 11:18 By ChoYoungIn)
	public GameWinScreen getGameWinScreen() {
		return gameWinScreen;
	}

	public void setGameOverScreen(GameOverScreen gameOverScreen) {
		this.gameOverScreen = gameOverScreen;
	}

	public PauseScreen getPauseScreen() {
		return pauseScreen;
	}

	public void setPauseScreen(PauseScreen pauseScreen) {
		this.pauseScreen = pauseScreen;
	}

	public LvlSelectScreen getLvlSelectScreen() {
		return lvlSelectScreen;
	}

	public void setLvlSelectScreen(LvlSelectScreen lvlSelectScreen) {
		this.lvlSelectScreen = lvlSelectScreen;
	}
	
	//added (2017.02.23 by Yeseul Cho)
	public SettingScreen getSettingScreen(){
		return settingScreen;
	}
	//added (2017.02.23 by Yeseul Cho)
	public void setSettingScreen(SettingScreen settingScreen){
		this.settingScreen = settingScreen;
	}
	//added (2017.02.23 by Yeseul Cho)
	public AboutScreen getAboutScreen(){
		return aboutScreen;
	}
	//added (2017.02.23 by Yeseul Cho)
	public void setAboutScreen(AboutScreen aboutScreen){
		this.aboutScreen = aboutScreen;
	}
}
