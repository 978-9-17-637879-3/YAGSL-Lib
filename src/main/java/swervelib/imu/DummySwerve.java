package swervelib.imu;

import edu.wpi.first.math.geometry.Rotation3d;
import edu.wpi.first.math.geometry.Translation3d;
import java.util.Optional;

/** IMU Swerve class for builds with no Gyroscope. */
public class DummySwerve extends SwerveIMU {

  /** No-op constrcutor */
  public DummySwerve() {}

  /** No-op factoryDefault */
  @Override
  public void factoryDefault() {}

  /** No-op sticky faults */
  @Override
  public void clearStickyFaults() {}

  /**
   * No-op offset
   *
   * @param offset gyro offset as a {@link Rotation3d}.
   */
  public void setOffset(Rotation3d offset) {}

  /**
   * No-op inversion
   *
   * @param invertIMU invert gyro direction
   */
  public void setInverted(boolean invertIMU) {}

  /**
   * Return 0 for heading
   *
   * @return {@link Rotation3d} from the IMU.
   */
  public Rotation3d getRawRotation3d() {
    return new Rotation3d(0, 0, 0);
  }

  /**
   * Return 0 for heading
   *
   * @return {@link Rotation3d} from the IMU.
   */
  @Override
  public Rotation3d getRotation3d() {
    return new Rotation3d(0, 0, 0);
  }

  /**
   * Return nulled accel optional
   *
   * @return {@link Translation3d} of the acceleration.
   */
  @Override
  public Optional<Translation3d> getAccel() {
    return Optional.ofNullable(null);
  }

  /**
   * Return null for IMU object
   *
   * @return IMU object.
   */
  @Override
  public Object getIMU() {
    return null;
  }
}
